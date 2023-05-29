const cont1 = document.querySelector(".asd");
const cont2 = document.querySelector(".asd2");
const carousel = document.querySelector(".carousel");
const iframe = document.querySelector(".iframe");
const aromatica = document.querySelector(".aromatica");
const cont3 = document.querySelector(".asd3");
const cont6 = document.querySelector(".asd6");
cont1.addEventListener("click", () => {
  carousel.classList.remove("disappear");
  iframe.classList.add("disappear");
  aromatica.classList.add("disappear");
  document.getElementById("carousel").scrollIntoView();
});

cont2.addEventListener("click", () => {
  carousel.classList.add("disappear");
  iframe.classList.add("disappear");
  aromatica.classList.remove("disappear");

  document.getElementById("aromatica").scrollIntoView();
});

cont3.addEventListener("click", () => {
  window.open("https://www.kctg.or.kr/index.do");
});

cont6.addEventListener("click", () => {
  carousel.classList.add("disappear");
  iframe.classList.remove("disappear");
  aromatica.classList.add("disappear");
  document.getElementById("iframe").scrollIntoView();
});
let backToTop = () => {
  // Scroll | button show/hide
  window.addEventListener("scroll", () => {
    if (document.querySelector("html").scrollTop > 100) {
      document.getElementById("go-top").style.display = "block";
    } else {
      document.getElementById("go-top").style.display = "none";
    }
  });
  // back to top
  document.getElementById("go-top").addEventListener("click", () => {
    window.scrollTo({
      top: 0,
      left: 0,
      behavior: "smooth",
    });
  });
};
backToTop();
