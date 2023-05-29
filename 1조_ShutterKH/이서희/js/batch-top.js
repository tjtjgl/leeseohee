document.addEventListener('DOMContentLoaded', function() {
    var badge = document.querySelector('.badge');
    
    badge.addEventListener('click', function() {
      window.scrollTo({ top: 0, behavior: 'smooth' });
    });
  });
  