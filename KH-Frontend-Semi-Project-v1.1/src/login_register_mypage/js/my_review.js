'use strict'

void (function (D) {
  if (!accountManager.isLogin()) {
    alert('작성한 후기를 보려면 로그인해야 합니다.')
    location.href = 'login.html'
  }
})(document)
