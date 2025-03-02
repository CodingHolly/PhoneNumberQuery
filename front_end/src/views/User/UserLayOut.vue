<template>
  <div>
    <div class="header">
      <div class="w1000">
        <div class="logo">
          <img src="@/assets/css/imgs/logo.jpg" height="60">
        </div>
      </div>
    </div>

    <div class="search-section">
      <div class="search-box" style="width: 920px">
        <div class="search-title">
          <p>
            电话号码查询
          </p>
        </div>
        <div class="input-box">
          <el-input v-model="input" placeholder="输入要查询的号码" class="input"></el-input>
          <el-button plain style="margin-left: 20px">查询</el-button>
        </div>
      </div>
    </div>

    <div class="content-identify" style="background-color: #fff">
      <div class="paddingbox">
        <p style="font-size: 20px;color: #000;text-align: center">电话号码归属地查询注意事项</p>
        <p style="font-size: 16px;color: #999;text-align: center;margin-top: 16px">本功能可以查询手机号码、固定电话号码、国际长途电话、区号</p>
        <ul style="margin: 50px 0 0 0">
          <li>
            <i class="disc"></i>
            <span class="question">输入号码时请注意：</span>
            <p class="answer" style="line-height: 32px">
              1.查询固定电话，请按照“区号-电话”的格式查询，例如：01087654321（或010-87654321）；
              <br>
              2.查询手机号码，请输入完整的11位手机号码，例如：13987654321（或013987654321）；
              <br>
              3.国际长途电话，请输入包括国际区号在内的所有号码，例如：00861087654321 (或+861087654321)；
              <br>
              4. 如果是来电号码，直接将所有字符一个不漏的输入查询框
            </p>
          </li>
        </ul>
      </div>

    </div>
  </div>

</template>

<script>
export default {
  name: "UserLayOut"
}
</script>

<style scoped>
.header {
  position: relative;
  height: 80px;
  z-index: 99;
  min-width: 1000px;
  background: #fff;
}

.w1000 {
  clear: both;
  margin: auto;
  width: 1100px;
}

.logo {
  float: left;
  margin: 10px 0 0 0;
}

.search-section {
  min-width: 1000px;
  margin-top: -1px;
  height: 250px;
}

.search-box {
  width: 920px;
  margin: auto;
  position: relative;
  z-index: 2;
}

.search-title {
  font-size: 26px;
  padding: 0 0 20px;
  color: black;
  letter-spacing: 4px;
  text-align: center;
  line-height: 30px;
  position: relative;
}

.input {
  width: 800px;
}

.content-identify {
  width: 1100px;
  margin: 18px auto;
  box-sizing: border-box;
  box-shadow: 0 0 10px #f0f1f1;
}
</style>