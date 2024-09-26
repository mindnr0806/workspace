import { Component } from "react";
import Comment from "./Comment";

const comments = [
    { id: 1, value: '안녕하세요 ?'},
    { id: 2, value: '반갑습니다. 곧 점심시간이네요^^'},
    { id: 3, value: '맛있게 드세요.'}
];

export default class CommentList extends Component {
    constructor(props) {
        super(props);

        this.state = {
            list: []
        };
    }

    componentDidMount() {
        this.interval = setInterval(() => {
            if (this.state.list.length < comments.length) {
                this.setState(prevState => ({
                    list: [...prevState.list, comments[prevState.list.length]]
                }));
            } else {
                clearInterval(this.interval); // 모든 댓글이 추가되면 타이머 정지
            }
        }, 2000);
    }

    componentWillUnmount() {
        clearInterval(this.interval); // 컴포넌트 언마운트 시 타이머 정지
    }

    render() {
        return (
            <>
                {
                    this.state.list.map((item) => {
                        return (
                            <Comment key={item.id} value={item.value} />
                        );
                    })
                }
            </>
        );
    }
}
