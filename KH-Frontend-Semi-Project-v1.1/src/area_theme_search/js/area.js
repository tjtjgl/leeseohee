const gangnam = document.querySelectorAll(".gangnam");
const mapo = document.querySelectorAll(".mapo");
const gangbook = document.querySelectorAll(".gangbook");
const young = document.querySelectorAll(".young");
const jong = document.querySelectorAll(".jong");

const all_btn = document.querySelector(".area_all");
const gangnam_btn = document.querySelector(".area_1");
const mapo_btn = document.querySelector(".area_2");
const gangbook_btn = document.querySelector(".area_3");
const young_btn = document.querySelector(".area_4");
const jong_btn = document.querySelector(".area_5");
const heart_icon = document.querySelectorAll(".heart_icon");

all_btn.addEventListener("click", () => {
  for (let i = 0; i < 5; i++) {
    gangnam[i].classList.remove("disappear");
    mapo[i].classList.remove("disappear");
    gangbook[i].classList.remove("disappear");
    young[i].classList.remove("disappear");
    jong[i].classList.remove("disappear");
  }

  all_btn.classList.add("click_color");
  gangnam_btn.classList.remove("click_color");
  mapo_btn.classList.remove("click_color");
  gangbook_btn.classList.remove("click_color");
  young_btn.classList.remove("click_color");
  jong_btn.classList.remove("click_color");
});
gangnam_btn.addEventListener("click", () => {
  for (let i = 0; i < 5; i++) {
    gangnam[i].classList.remove("disappear");
    mapo[i].classList.add("disappear");
    gangbook[i].classList.add("disappear");
    young[i].classList.add("disappear");
    jong[i].classList.add("disappear");
  }

  gangnam_btn.classList.add("click_color");
  all_btn.classList.remove("click_color");
  mapo_btn.classList.remove("click_color");
  gangbook_btn.classList.remove("click_color");
  young_btn.classList.remove("click_color");
  jong_btn.classList.remove("click_color");
  console.log("hp");
});

mapo_btn.addEventListener("click", () => {
  for (let i = 0; i < 5; i++) {
    gangnam[i].classList.add("disappear");
    mapo[i].classList.remove("disappear");
    gangbook[i].classList.add("disappear");
    young[i].classList.add("disappear");
    jong[i].classList.add("disappear");
  }
  mapo_btn.classList.add("click_color");
  all_btn.classList.remove("click_color");
  gangnam_btn.classList.remove("click_color");
  gangbook_btn.classList.remove("click_color");
  young_btn.classList.remove("click_color");
  jong_btn.classList.remove("click_color");
});
gangbook_btn.addEventListener("click", () => {
  for (let i = 0; i < 5; i++) {
    gangnam[i].classList.add("disappear");
    mapo[i].classList.add("disappear");
    gangbook[i].classList.remove("disappear");
    young[i].classList.add("disappear");
    jong[i].classList.add("disappear");
  }
  gangbook_btn.classList.add("click_color");
  all_btn.classList.remove("click_color");
  mapo_btn.classList.remove("click_color");
  gangnam_btn.classList.remove("click_color");
  young_btn.classList.remove("click_color");
  jong_btn.classList.remove("click_color");
});
young_btn.addEventListener("click", () => {
  for (let i = 0; i < 5; i++) {
    gangnam[i].classList.add("disappear");
    mapo[i].classList.add("disappear");
    gangbook[i].classList.add("disappear");
    young[i].classList.remove("disappear");
    jong[i].classList.add("disappear");
  }
  young_btn.classList.add("click_color");
  all_btn.classList.remove("click_color");
  mapo_btn.classList.remove("click_color");
  gangbook_btn.classList.remove("click_color");
  gangnam_btn.classList.remove("click_color");
  jong_btn.classList.remove("click_color");
});
jong_btn.addEventListener("click", () => {
  for (let i = 0; i < 5; i++) {
    gangnam[i].classList.add("disappear");
    mapo[i].classList.add("disappear");
    gangbook[i].classList.add("disappear");
    young[i].classList.add("disappear");
    jong[i].classList.remove("disappear");
  }
  jong_btn.classList.add("click_color");
  all_btn.classList.remove("click_color");
  mapo_btn.classList.remove("click_color");
  gangbook_btn.classList.remove("click_color");
  young_btn.classList.remove("click_color");
  gangnam_btn.classList.remove("click_color");
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

for (let i = 0; i < heart_icon.length; i++) {
  heart_icon[i].addEventListener("click", () => {
    heart_icon[i].style.color = "#F24A6E";
  });
}
