const title1 = document.querySelector(".title1");
const title2 = document.querySelector(".title2");
const title3 = document.querySelector(".title3");
const title4 = document.querySelector(".title4");
const title5 = document.querySelector(".title5");

const text = document.querySelectorAll(".search_content_title");
const chang = document.querySelector(".chang");

const sc2 = document.querySelectorAll(".sc2");
const sc3 = document.querySelectorAll(".sc3");
const sc4 = document.querySelector(".sc4");

const text_input = document.querySelector(".text_input");

text_input.addEventListener("input", () => {
  for (let i = 0; i < text.length; i++) {
    if (text[i].innerHTML.indexOf(text_input.value) != -1) {
      text[i].parentElement.parentElement.classList.remove("disappear");
    } else {
      text[i].parentElement.parentElement.classList.add("disappear");
    }
  }
});

title1.addEventListener("click", () => {
  title2.classList.remove("click_bold");
  title3.classList.remove("click_bold");
  title4.classList.remove("click_bold");
  title5.classList.remove("click_bold");
  title1.classList.add("click_bold");

  for (let i = 0; i < sc2.length; i++) {
    sc2[i].classList.remove("disappear");
  }
  for (let i = 0; i < sc3.length; i++) {
    sc3[i].classList.remove("disappear");
  }
  sc4.classList.remove("disappear");
});

title2.addEventListener("click", () => {
  title1.classList.remove("click_bold");
  title3.classList.remove("click_bold");
  title4.classList.remove("click_bold");
  title5.classList.remove("click_bold");
  title2.classList.add("click_bold");

  for (let i = 0; i < sc2.length; i++) {
    sc2[i].classList.remove("disappear");
  }
  for (let i = 0; i < sc3.length; i++) {
    sc3[i].classList.add("disappear");
  }
  sc4.classList.add("disappear");
});

title3.addEventListener("click", () => {
  title1.classList.remove("click_bold");
  title2.classList.remove("click_bold");
  title4.classList.remove("click_bold");
  title5.classList.remove("click_bold");
  title3.classList.add("click_bold");

  for (let i = 0; i < sc2.length; i++) {
    sc2[i].classList.add("disappear");
  }
  for (let i = 0; i < sc3.length; i++) {
    sc3[i].classList.remove("disappear");
  }
  sc4.classList.add("disappear");
});

title4.addEventListener("click", () => {
  title1.classList.remove("click_bold");
  title2.classList.remove("click_bold");
  title3.classList.remove("click_bold");
  title5.classList.remove("click_bold");
  title4.classList.add("click_bold");

  for (let i = 0; i < sc2.length; i++) {
    sc2[i].classList.add("disappear");
  }
  for (let i = 0; i < sc3.length; i++) {
    sc3[i].classList.add("disappear");
  }
  sc4.classList.remove("disappear");
});

title5.addEventListener("click", () => {
  title1.classList.remove("click_bold");
  title2.classList.remove("click_bold");
  title3.classList.remove("click_bold");
  title4.classList.remove("click_bold");
  title5.classList.add("click_bold");

  for (let i = 0; i < sc2.length; i++) {
    sc2[i].classList.add("disappear");
  }
  for (let i = 0; i < sc3.length; i++) {
    sc3[i].classList.add("disappear");
  }
  sc4.classList.add("disappear");
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
chang.addEventListener("click", () => {
  location.href = "area_info.html";
});
