$(function () {
  $(document).on('scroll', function () {
    if (window.scrollY > 100) {
      $('header .inIcon img').css('filter', 'invert(100%)')
      $('header .outIcon img').css('filter', 'invert(100%)')
    } else {
      $('header .inIcon img').css('filter', 'invert(0%)')
      $('header .outIcon img').css('filter', 'invert(0%)')
    }
  })
})
