document.addEventListener('DOMContentLoaded', function() {
    const cityFilters = document.querySelectorAll('.gender-filter span');
    const festivalItemsTop = document.querySelectorAll('#favorite-area-top .festival-item');
    const festivalItemsBottom = document.querySelectorAll('#favorite-area-bottom .festival-item');
  
    // 축제 데이터 (실제로는 서버에서 가져와야 합니다)
    const festivalData = {
      '남성': [
        { image: 'https://kfescdn.visitkorea.or.kr/kfes/upload/contents/db/300_3a7630df-c1da-4c3c-a0c0-21923699b312_1.jpg', name: '서울 등축제', info: '매년 11월 개최' },
        { image: 'https://kfescdn.visitkorea.or.kr/kfes/upload/contents/db/300_edf65db1-8c43-4cf8-b1f7-098fa7e4250f_1.png', name: '서울 불꽃축제', info: '매년 10월 개최' },
        { image: 'https://kfescdn.visitkorea.or.kr/kfes/upload/contents/db/300_3a7630df-c1da-4c3c-a0c0-21923699b312_1.jpg', name: '서울 등축제', info: '매년 11월 개최' },
        { image: 'https://kfescdn.visitkorea.or.kr/kfes/upload/contents/db/300_e4351add-7b59-4842-b3b5-c38062b47c7c_1.jpg', name: '서울 불꽃축제', info: '매년 10월 개최' },
        { image: 'https://kfescdn.visitkorea.or.kr/kfes/upload/contents/db/300_3a7630df-c1da-4c3c-a0c0-21923699b312_1.jpg', name: '서울 등축제', info: '매년 11월 개최' },
        { image: 'https://kfescdn.visitkorea.or.kr/kfes/upload/contents/db/300_edf65db1-8c43-4cf8-b1f7-098fa7e4250f_1.png', name: '서울 불꽃축제', info: '매년 10월 개최' }
      ],
      '여성': [
        { image: 'https://kfescdn.visitkorea.or.kr/kfes/upload/contents/db/300_68c11dc3-fcbb-47d8-a2a6-df31b271542a_1.jpg', name: '수원화성문화제', info: '매년 10월 개최' },
        { image: 'https://kfescdn.visitkorea.or.kr/kfes/upload/contents/db/300_d6a40a6c-2fb2-4d12-9093-b437539b83c9_1.jpg', name: '이천쌀문화축제', info: '매년 10월 개최' },
        { image: 'https://kfescdn.visitkorea.or.kr/kfes/upload/contents/db/300_68c11dc3-fcbb-47d8-a2a6-df31b271542a_1.jpg', name: '수원화성문화제', info: '매년 10월 개최' },
        { image: 'https://kfescdn.visitkorea.or.kr/kfes/upload/contents/db/300_d6a40a6c-2fb2-4d12-9093-b437539b83c9_1.jpg', name: '이천쌀문화축제', info: '매년 10월 개최' },
        { image: 'https://kfescdn.visitkorea.or.kr/kfes/upload/contents/db/300_68c11dc3-fcbb-47d8-a2a6-df31b271542a_1.jpg', name: '수원화성문화제', info: '매년 10월 개최' },
        { image: 'https://kfescdn.visitkorea.or.kr/kfes/upload/contents/db/300_d6a40a6c-2fb2-4d12-9093-b437539b83c9_1.jpg', name: '이천쌀문화축제', info: '매년 10월 개최' },
        { image: 'https://kfescdn.visitkorea.or.kr/kfes/upload/contents/db/300_8129adef-6a10-4b6e-857e-3390fd96d74a_1.jpg', name: '수원화성문화제', info: '매년 10월 개최' },
        { image: 'https://kfescdn.visitkorea.or.kr/kfes/upload/contents/db/300_d6a40a6c-2fb2-4d12-9093-b437539b83c9_1.jpg', name: '이천쌀문화축제', info: '매년 10월 개최' }
    ]
    };
  
    cityFilters.forEach(filter => {
      filter.addEventListener('click', function() {
        // 활성화된 필터 스타일 변경
        cityFilters.forEach(item => item.classList.remove('active'));
        this.classList.add('active');
  
        const selectedCity = this.textContent.replace('#', '');
        const cityFestivals = festivalData[selectedCity] || [];
  
        // 상단 3개 테이블 업데이트
        festivalItemsTop.forEach((item, index) => {
          if (index < cityFestivals.length) {
            const festival = cityFestivals[index];
            const img = item.querySelector('img');
            const nameCell = item.querySelector('p:nth-of-type(1)');
            const infoCell = item.querySelector('p:nth-of-type(2)');
  
            img.src = festival.image;
            img.alt = `${festival.name} 이미지 없음`;
            nameCell.textContent = festival.name;
            infoCell.textContent = festival.info;
            item.style.display = 'block';
          } else {
            item.style.display = 'none'; // 데이터가 없는 경우 숨기기
          }
        });
  
        // 하단 6개 테이블 업데이트
        festivalItemsBottom.forEach((item, index) => {
          if (index < cityFestivals.length) {
            const festival = cityFestivals[index];
            const img = item.querySelector('img');
            const nameCell = item.querySelector('p:nth-of-type(1)');
            const infoCell = item.querySelector('p:nth-of-type(2)');
  
            img.src = festival.image;
            img.alt = `${festival.name} 이미지 없음`;
            nameCell.textContent = festival.name;
            infoCell.textContent = festival.info;
            item.style.display = 'block';
          } else {
            item.style.display = 'none'; // 데이터가 없는 경우 숨기기
          }
        });
      });
    });
  });
  