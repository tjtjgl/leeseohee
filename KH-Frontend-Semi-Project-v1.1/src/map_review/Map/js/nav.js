const logo_img = document.querySelector(".logo");
const header = document.querySelector(".header");
const colored = document.querySelectorAll(".colored");
const nav_icon = document.querySelectorAll(".nav_icon");
document.addEventListener("scroll", function () {
  if (window.scrollY > 100) {
    logo_img.classList.remove("active_title");
    logo_img.classList.add("deactive_title");

    header.classList.remove("active");
    header.classList.add("deactive");
    for (let i = 0; i < colored.length; i++) {
      colored[i].classList.add("deactive_font");
      colored[i].classList.remove("active_font");
    }
    for (let i = 0; i < nav_icon.length; i++) {
      nav_icon[i].classList.add("deactive_font");
      nav_icon[i].classList.remove("active_font");
    }
  } else {
    logo_img.classList.add("active_title");
    logo_img.classList.remove("deactive_title");

    logo_img.src = "img/logo2.png";
    logo_img.width = "200";
    header.classList.remove("deactive");
    header.classList.add("active");
    for (let i = 0; i < colored.length; i++) {
      colored[i].classList.remove("deactive_font");
      colored[i].classList.add("active_font");
    }
    for (let i = 0; i < nav_icon.length; i++) {
      nav_icon[i].classList.remove("deactive_font");
      nav_icon[i].classList.add("active_font");
    }
  }
});
