<template>
    <div class="header">
        <div class="header_title">
            <span class="addContainer">
                <i class="fas fa-chevron-circle-right">ss</i>
            </span>
            <span class="title">[공통] 인입그룹 보고서</span>
        </div>
        <div class="header_content">
            <div class="container">
                <div class="info">
                    <div class="menu">
                        일 선택&nbsp;&nbsp;&nbsp;&nbsp;
                        <input class="input_box" type="text">
                        <button class="input_btn">조회</button>
                    </div>

                    <div class="menu">
                        조회구분&nbsp;&nbsp;
                        <span style="font-weight:normal">일별</span>
                    </div>

                    <div class="menu">
                        조회기간&nbsp;&nbsp;
                        <span style="font-weight:normal">2021-12-15 ~ 2021-12-15</span>
                    </div> 

                    <div class="menu">
                        조회시간&nbsp;&nbsp;
                    <span style="font-weight:normal">00:00 ~ 24:00</span>
                    </div>
                </div>
                <div class="option">
                    <button>엑셀파일 저장</button>
                    <a href target="_blank" onClick="window.open('https://www.naver.com ','pagename','resizable,height=600,width=800'); return false;">항목설명</a>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {

}
</script>

<style scoped>
.header {
    background-color: #e7e7e7;
    display: block;
    padding: 0px 10px 10px 10px;
    height: 200px;
}
.header .router-link-exact-active {
    color: red;
}

.header a {
    color: rgb(24, 23, 22);
    
}


.header_title{
    width: 300px;
    padding: 13px;
    background-color: chocolate;
    border-radius: 0px 0px 10px 10px;
}
.title {
    color: black;
    height: 20px;
    font-size: 18px;
    font-weight: bold;
}
.header_content {
    display: block;
}
.input_box{
    width: 110px;
}
.input_btn{
    margin: 0px 0px 0px 30px;
    width: 60px;
    border-radius: 10px;
}
.container{
    display: grid;
    grid-template-columns: 2fr 1fr;
}
.info {
    padding: 13px 10px 10px 14px;
}
.option {
    padding: 70px 0px 10px 0px;
}    
.menu {
    font-weight: bold;
    padding: 5px;
}
</style>