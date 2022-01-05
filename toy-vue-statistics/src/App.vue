<!--최상위 컴포넌트--> 
<template>
  <div id="app">
    <title-bar></title-bar>
    <report-bar></report-bar>
  </div>
</template>

<script>
import TitleBar from './components/TitleBar.vue'
import ReportBar from './components/ReportBar.vue'


export default {
  name: 'App',
  components: {
    TitleBar, 
    ReportBar,
  }
}
</script>

<style>
body {
  padding: 0;
  margin: 0;
}
</style>
