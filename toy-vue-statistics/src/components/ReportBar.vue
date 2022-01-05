<template>
  <div class="report">
      <table>
        <tr>
            <th>인입그룹명</th>
            <th>날짜/시간</th>
            <th>인입률</th>
            <th>응답률</th>
            <th>포기콜</th>
            <th>콜백콜</th>
            <th>보낸호전환률</th>
            <th>응답율(%)</th>
            <th>포기율(%)</th>
            <th>서비스레벨(20초)(%)</th>
            <th>통화시간</th>
            <th>포기시간</th>
            <th>응답시간</th>
        </tr> 
        <tr v-for="item in items" :key="item.title">
          <td class="group_name"><span v-html="item.userRating"></span></td>
          <td><a target="_blank" :href="item.userRating">{{item.userRating}} 444444444444444</a></td>
          <td>zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzddddddddddddddddddddddd!!!!!!!!!!!!!!</td>
          <td><span v-html="item.subtitle"></span></td>
          <td><span v-html="item.pubDate"></span></td>
          <td><span v-html="item.pubDate"></span></td>
          <td><span v-html="item.pubDate"></span></td>
          <td><span v-html="item.pubDate"></span></td>
          <td><span v-html="item.pubDate"></span></td>
          <td><span v-html="item.pubDate"></span></td>
          <td><span v-html="item.pubDate"></span></td>
          <td><span v-html="item.pubDate"></span></td>
          <td><span v-html="item.pubDate"></span></td>
        </tr>
        <tr>
          <td colspan="2">총합계</td>
          <td>23</td>
          <td>12</td>
          <td>11</td>
          <td>33</td>
          <td>66</td>
          <td>77</td>
          <td>88</td>
          <td>99</td>
          <td>2ddddddddddddddd2</td>
          <td>20</td>
          <td>10</td>

        </tr>
      </table>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        items: [
          {
            "title": "클라쎄오토용산",
            "link": "https://movie.naver.com/movie/bi/mi/basic.nhn?code=161967",
            "image": "https://ssl.pstatic.net/imgmovie/mdi/mit110/1619/161967_P153_134645.jpg",
            "subtitle": "PARASITE",
            "pubDate": "2019",
            "director": "봉준호|",
            "actor": "송강호|이선균|조여정|최우식|박소담|이정은|장혜진|",
            "userRating": "8.49"
          },
          {
            "title": "벤틀리IN",
            "link": "https://movie.naver.com/movie/bi/mi/basic.nhn?code=193323",
            "image": "https://ssl.pstatic.net/imgmovie/mdi/mit110/1933/193323_P01_114001.jpg",
            "subtitle": "Running With The Devil",
            "pubDate": "2019",
            "director": "제이슨 카벨|",
            "actor": "니콜라스 케이지|로렌스 피시번|",
            "userRating": "0.00"
          },
          {
            "title": "닛산IN",
            "link": "https://movie.naver.com/movie/bi/mi/basic.nhn?code=181006",
            "image": "https://ssl.pstatic.net/imgmovie/mdi/mit110/1810/181006_P01_155150.jpg",
            "subtitle": "The Unbelievable Ability",
            "pubDate": "2018",
            "director": "나츠메 타이치로|",
            "actor": "오다지마 나기사|",
            "userRating": "8.00"
          },
          {
            "title": "<b>볼보IN</b>",
            "link": "https://movie.naver.com/movie/bi/mi/basic.nhn?code=59747",
            "image": "",
            "subtitle": "A Parasite",
            "pubDate": "2002",
            "director": "박민재|",
            "actor": "신동훈|함승희|이경수|",
            "userRating": "0.00"
          }
        ]
      }
    }
  }
</script>

<style>
  .report {
    overflow: scroll;
  }
  table, th, td {
    border: 1px solid #bcbcbc;
    width:100%;
  }
  td {
    text-align: center;
  }
  .group_name {
    text-align: left;
    width: 50;
    
  }
  

</style>