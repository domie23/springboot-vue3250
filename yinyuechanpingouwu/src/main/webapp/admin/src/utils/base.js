const base = {
    get() {
        return {
            url : "http://localhost:8080/yinyuechanpingouwu/",
            name: "yinyuechanpingouwu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yinyuechanpingouwu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "音乐产品购物网站"
        } 
    }
}
export default base
