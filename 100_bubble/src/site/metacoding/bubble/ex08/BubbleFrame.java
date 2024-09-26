package site.metacoding.bubble.ex08;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author jaewon 목적 : 버블 발사하기 (충돌감지는 안함!) 수평발사
 *
 */

// main을 가진 클래스는 해당 프로그램의 컨텍스트(문맥)를 다 알고 있다.
// 모든게 main에서 시작(new)하니까 뿌리를 다 알고있기 때문
// 따라서 main을 가진 클래스를 컨텍스트라고 부른다.
public class BubbleFrame extends JFrame/* implements BubbleContext */ {

	// 사용할 때는 BubbleFrame으로 다운캐스팅하여 사용해야함
	// private BubbleContext context = this; // BubbleFrame의 heap 주소
	// player가 new될 때 넘겨주면 됨 그래야 context에 접근해 버블 add 가능
	// 클래스가 context가 알게하기 위해서는 컴포지션 해야함
	// 아니면 그냥 main메서드가 알고있는것일 뿐 !
	private BubbleFrame context = this;

	private JLabel backgroundMap;
	private Player player; // JLabel

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public BubbleFrame() {
		initObject();
		initSetting();
		initListener();
		initService(); // 리스너 바로뒤에 써주면 좋음
		setVisible(true); // 내부에 paintComponent() 호출 코드가 있다.

		// 테스트
		// new BackgroundMapService(player);
	}

	// new 하는 것
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap); // 백그라운드 화면 설정

		player = new Player(context); // 플레이어 추가
		add(player); // Frame에 추가
	}

	private void initService() {
		new Thread(new BackgroundMapService(player)).start();
	}

	// 각종 모든 세팅
	private void initSetting() {
		setSize(1000, 640);
		getContentPane().setLayout(null); // null을 줘야 absolute 레이아웃이 됨
		setLocationRelativeTo(null); // 가운데 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 JVM 같이 종료하기
	}

	// 키보드
	private void initListener() {
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) { // 누른걸 떼면
				// System.out.println("키보드 릴리즈");

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // int니까 ==으로 비교
					// isRight를 false
					player.setRight(false);
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					// isLeft를 false
					player.setLeft(false);
				}
			}

			// 조이스틱
			@Override
			public void keyPressed(KeyEvent e) { // 누르면
				// 왼 37, 오 39, 위 38, 아래 40
				// System.out.println("키보드 프레스 : " + e.getKeyCode());

				// 그러기 위해선 누르고 있는지 누르고 있지 않은지 확인하는 상태 변수가 필요하다.
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // int니까 ==으로 비교
					// 키보드를 누르고 있는 동안 right() 메서드는 한번만 실행하고 싶다.
					if (!player.isRight() && player.isRightWallCrash() == false) { // == false 와 같음
						player.right(); // 이동은 플레이어의 책임
					}
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					if (!player.isLeft() && player.isLeftWallCrash() == false) {
						player.left();
					}
				} else if (e.getKeyCode() == KeyEvent.VK_UP) { // if 자체를 막으면 이벤트 루프 등록을 안함
					// System.out.println("체크");
					if (!player.isUp() && !player.isDown()) {
						player.up(); // 메서드 내부에서 if 분기 처리는 이벤트 루프에 등록은 되는데 실행이 안되는 것
					}
				} else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					// 버블을 쏘는 것은 Player의 책임
					// Bubble bubble = new Bubble();
					// add(bubble); 여기다 만들면 안됨!! 플레이어의 책임임 !!
					player.attack();
				}
			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}

}