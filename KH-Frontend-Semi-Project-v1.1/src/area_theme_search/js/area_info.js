const picture = document.querySelector(".content_menu_picture");
const info = document.querySelector(".content_menu_info");
const talk = document.querySelector(".content_menu_talk");
const heart_icon = document.querySelector("#heart_icon");
const newopen = document.querySelector("#newopen");
const hidden_content = document.querySelector(".hidden_content");
const show_content = document.querySelector(".show_content");
show_content.addEventListener("click", () => {
  if (show_content.innerHTML == "내용 닫기-") {
    show_content.innerHTML = "내용 더보기+";
    hidden_content.classList.add("disappear");
  } else {
    show_content.innerHTML = "내용 닫기-";
    hidden_content.classList.remove("disappear");
  }
});

newopen.addEventListener("click", () => {
  window.open("area_info.html", "_blank", "width=1200, height=2000");
});

picture.addEventListener("click", () => {
  document.getElementById("content_img").scrollIntoView();
  picture.classList.add("clicked");
  info.classList.remove("clicked");
  talk.classList.remove("clicked");
});

info.addEventListener("click", () => {
  document.getElementById("content_detail").scrollIntoView();
  picture.classList.remove("clicked");
  info.classList.add("clicked");
  talk.classList.remove("clicked");
});

talk.addEventListener("click", () => {
  document.getElementById("content_comment").scrollIntoView();
  picture.classList.remove("clicked");
  info.classList.remove("clicked");
  talk.classList.add("clicked");
});

heart_icon.addEventListener("click", () => {
  heart_icon.style.color = "#F24A6E";
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
