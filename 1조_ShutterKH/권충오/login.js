
// 로그인하단 회원가입 버튼
$("#loginbar_newBtn").click(function () {
    $(".kwon_findId").css("display", "none"); // 아이디찾기
    $(".kwon_login").css("display", "none"); // 로그인창
    $(".kwon_findPw").css("display", "none"); // 비밀번호찾기
    $(".kwon_newUser").css("display", "block"); // 회원가입
    $(".main").css("background-color", "#f7f7f7");
    $(".mainText3").css("display", "none");
    $(".mainText4").css("display", "block");
});

// 로그인 하단 아이디 찾기 버튼
$("#loginbar_idBtn").click(function () {
    $(".kwon_findId").css("display", "block"); // 아이디찾기
    $(".kwon_login").css("display", "none"); // 로그인창
    $(".kwon_findPw").css("display", "none"); // 비밀번호찾기
    $(".kwon_newUser").css("display", "none"); // 회원가입
    $(".main").css("background-color", "#f7f7f7");
    $(".mainText3").css("display", "none");
    $(".mainText1").css("display", "block");
});

// 로그인하단 비밀번호 찾기 버튼
$("#loginbar_pwBtn").click(function () {
    $(".kwon_findId").css("display", "none"); // 아이디찾기
    $(".kwon_login").css("display", "none"); // 로그인창
    $(".kwon_findPw").css("display", "block"); // 비밀번호찾기
    $(".kwon_newUser").css("display", "none"); // 회원가입
    $(".main").css("background-color", "#f7f7f7");
    $(".mainText3").css("display", "none");
    $(".mainText2").css("display", "block");
});


/*****************************************/

//회원가입 신청 유효성검사

var emailcheck = "@";
var phonetext = "";
var i = 0;
var text1 = "";
var text2 = "";
var text3 = "";

var totalObject = {
    totalIdCheck: false
    , totalPwCheck: false
    , totalPwCheck1: false
    , totalPhoneCheck: false
    , totalAgreeCheck: false
    , totalEmailCheck: false
    , totalSmsCheck: false
    , totalEmailWantCheck: false
    , totalRangeCheck: false
};
var loginmember = {};
var idcheck = false;

// 아이디
$("#idBox").keyup(function () {
    id = $("#idBox").val();
    idErr = $("#idErr").val();
    if (id.length < 5 || id.length > 15) {
        $("#idErr").text("5~15 사이 입력");
        $("#idErr").css("color", "red");

    } else {
        $("#idErr").text("아이디 중복 확인을 해주세요");
        $("#idErr").css("color", "red");
        idcheck = true;
    }
});

// // 중복확인 버튼
$("#idcheckbtn").click(function () {
    let id = $("#idBox").val();
    let arr = [];

    for (let j = 0; j <= localStorage.length; j++) {
        let item = JSON.parse(localStorage.getItem(j));
        if (item && item.userid) {

            arr[j] = item.userid;

        }
    }
    let isDuplicate = false;
    for (let j = 0; j < arr.length; j++) {
        if (arr[j] === id) {
            isDuplicate = true;
            break;
        }
    }

    if (isDuplicate || !idcheck) {
        $("#idErr").text("사용하실 수 없는 아이디입니다.");
        $("#idErr").css("color", "red");
        totalObject.totalIdCheck = false;
    } else {
        $("#idErr").text("사용하실 수 있는 아이디입니다.");
        $("#idErr").css("color", "green");
        totalObject.totalIdCheck = true;
    }
});



// 비밀번호
$("#pwbox").keyup(function () {
    let pw = $("#pwbox").val();

    if (pw.length > 9 && pw.length < 21) {
        $("#pwcheck3").attr("src", "https://images.freeimages.com/clg/images/36/369607/anselmus-green-checkmark-and-red-minus-clip-art_f.jpg");
        $("#pwcheck3").css("opacity", "1");
        text1 = "true"
    } else {
        $("#pwcheck3").attr("src", "https://images.freeimages.com/vme/images/1/7/171887/simple_red_checkmark_clip_art_preview.jpg");
        $("#pwcheck3").css("opacity", "1");
        text1 = "false"
    }
    if (/\d/.test(pw)) {
        $("#pwcheck2").attr("src", "https://images.freeimages.com/clg/images/36/369607/anselmus-green-checkmark-and-red-minus-clip-art_f.jpg");
        $("#pwcheck2").css("opacity", "1");
        text2 = "true"
    } else {
        $("#pwcheck2").attr("src", "https://images.freeimages.com/vme/images/1/7/171887/simple_red_checkmark_clip_art_preview.jpg");
        $("#pwcheck2").css("opacity", "1");
        text2 = "false"
    }
    if (/[a-zA-Z]/.test(pw)) {
        $("#pwcheck1").attr("src", "https://images.freeimages.com/clg/images/36/369607/anselmus-green-checkmark-and-red-minus-clip-art_f.jpg");
        $("#pwcheck1").css("opacity", "1");
        text3 = "true"
    } else {
        $("#pwcheck1").attr("src", "https://images.freeimages.com/vme/images/1/7/171887/simple_red_checkmark_clip_art_preview.jpg");
        $("#pwcheck1").css("opacity", "1");
        text3 = "false"
    }

    if (!(text1 == "true" && text2 == "true" && text3 == "true")) {
        $("#pwErr").text("비밀번호 형식에 맞게 입력해주세요");
        $("#pwErr").css("color", "red");
    } else {
        $("#pwErr").text("");

    }
});

$("#pwbox").focusout(function () {
    if ((text1 == "true" && text2 == "true" && text3 == "true")) {
        totalObject.totalPwCheck = true;
    } else {
        totalObject.totalPwCheck = false;
    }
});

// 비밀번호 확인
$("#checkpwbox").focusout(function () {
    let pw = $("#pwbox").val();
    let checkpw = $("#checkpwbox").val();
    if (pw != checkpw) {
        $("#checkpwErr").text("비밀번호가 일치하지 않습니다.");
        $("#checkpwErr").css("color", "red");
        totalObject.totalPwCheck1 = false;
    } else {
        $("#checkpwErr").text("비밀번호가 일치합니다.");
        $("#checkpwErr").css("color", "green");
        totalObject.totalPwCheck1 = true;
    }
});

// 휴대폰
$("#phonebox").keyup(function () {
    let phone = $("#phonebox").val();
    phone = phone.replace(/[a-zA-Z]/g, ""); // 영어 정규식
    phone = phone.replace(/[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/, "");   // 한글정규식
    phone = phone.replace(/[^\w\s]/, ""); // 특수문자 정규식
    phone = phone.replaceAll("-", "");
    $("#phonebox").val(phone);

    if (phone.length < 9) {
        $("#phoneErr").text("휴대폰은 9자리 이상 입력 가능합니다.");
        $("#phoneErr").css("color", "red");
    } else {
        $("#phoneErr").text("");
        phonetext = "true"
    }
});

$("#phonebox").focusout(function () {
    if (phonetext == "true") {
        totalObject.totalPhoneCheck = true;
    } else {
        totalObject.totalPhoneCheck = false;
    }
});


// sms 수신
$('input[name="smsRadio"]').on('change', function () {
    // 선택된 라디오 버튼의 값 가져오기
    let smsWantcheck = $('input[name="smsRadio"]:checked').val();

    // 체크 여부에 따라 totalObject 업데이트
    if (smsWantcheck === undefined) {
        totalObject.totalSmsCheck = false;
    } else {
        totalObject.totalSmsCheck = true;
    }
});

// 이메일 수신
$('input[name="emailRadio"]').on('change', function () {
    // 선택된 라디오 버튼의 값 가져오기
    let emailWantcheck = $('input[name="emailRadio"]:checked').val();

    // 체크 여부에 따라 totalObject 업데이트
    if (emailWantcheck === undefined) {
        totalObject.totalEmailWantCheck = false;
    } else {
        totalObject.totalEmailWantCheck = true;
    }
});

// 유효기간 체크
$('input[name="rangeRaido"]').on('change', function () {
    // 선택된 라디오 버튼의 값 가져오기
    let rangeWantcheck = $('input[name="rangeRaido"]:checked').val();

    // 체크 여부에 따라 totalObject 업데이트
    if (rangeWantcheck === undefined) {
        totalObject.totalRangeCheck = false;
    } else {
        totalObject.totalRangeCheck = true;
    }
});


// 약관동의 체크
$("#totalAgree").click(function () {
    if ($(this).is(":checked")) {
        $("#agreecheck1").prop("checked", true);
        $("#agreecheck2").prop("checked", true);
        $("#agreecheck3").prop("checked", true);
        totalObject.totalAgreeCheck = true;
    } else {
        $("#agreecheck1").prop("checked", false);
        $("#agreecheck2").prop("checked", false);
        $("#agreecheck3").prop("checked", false);
        totalObject.totalAgreeCheck = false;
    }
});

$("#agreecheck1, #agreecheck2, #agreecheck3").click(function () {
    if ($("#agreecheck1").is(":checked") && $("#agreecheck2").is(":checked") && $("#agreecheck3").is(":checked")) {
        $("#totalAgree").prop("checked", true);
        totalObject.totalAgreeCheck = true;
    } else {
        $("#totalAgree").prop("checked", false);
        totalObject.totalAgreeCheck = false;
    }
});
$("#agreecheck1").click(function () {
    if ($("#agreecheck1").is(":checked")) {
        totalObject.totalAgreeCheck = true;
    } else {
        totalObject.totalAgreeCheck = false;
    }
})

// 약관동의 버튼
$("#checkBtn1").click(function () {

    if ($("#check1").css("transform") == "none" || $("#check1").css("transform") == 'matrix(1, 0, 0, 1, 0, 0)') {
        $("#check1").css({
            "transform": "rotate(180deg)"
            , "transition": "transform 0.5s"
        })
        $(".box1").css({
            "display": "block"
        })
    } else {
        $("#check1").css({
            "transform": "rotate(0deg)"
            , "transition": "transform 0.5s"
        })
        $(".box1").css({
            "display": "none"
        })
    }

});

$("#checkBtn2").click(function () {

    if ($("#check2").css("transform") == "none" || $("#check2").css("transform") == 'matrix(1, 0, 0, 1, 0, 0)') {
        $("#check2").css({
            "transform": "rotate(180deg)"
            , "transition": "transform 0.5s"
        })
        $(".box2").css({
            "display": "block"
        })
    } else {
        $("#check2").css({
            "transform": "rotate(0deg)"
            , "transition": "transform 0.5s"
        })
        $(".box2").css({
            "display": "none"
        })
    }

});

$("#checkBtn3").click(function () {

    if ($("#check3").css("transform") == "none" || $("#check3").css("transform") == 'matrix(1, 0, 0, 1, 0, 0)') {
        $("#check3").css({
            "transform": "rotate(180deg)"
            , "transition": "transform 0.5s"
        })
        $(".box3").css({
            "display": "block"
        })
    } else {
        $("#check3").css({
            "transform": "rotate(0deg)"
            , "transition": "transform 0.5s"
        })
        $(".box3").css({
            "display": "none"
        })
    }

});

// 이메일
$("#emailbox").keyup(function () {

    if ($("#emailbox").val().indexOf(emailcheck) == -1 || $("#emailbox").val().substring($("#emailbox").val().length - 1, $("#emailbox").val().length) == "@") {
        $("#emailErr").text("이메일 형식에 맞춰주세요.");
        $("#emailErr").css("color", "red");
        totalObject.totalEmailCheck = false;
    } else {
        $("#emailErr").text("");
        totalObject.totalEmailCheck = true;
    }
});

/*****************************************/

// 가입하기 버튼 
$("#newbtn").click(function () {
    if (!$("#agreecheck1").prop("checked")) {
        $("#agreeErr").css({
            "display": "block"
            , "color": "red"
        });
        $("#agreeErr").text("약관 동의 필수는 체크해야합니다.");
    } else if (Object.values(totalObject).includes(false)) {

        Swal.fire({
            icon: "error"
            , title: '<span class="popup-all popup-error">회원가입 창 내용을 조건에 맞게 채워주세요.'
            , confirmButtonColor: '#2F4858'
            , closeOnClickOutside: false
        });

    } else {
        $("#agreeErr").css("display", "none");
        totalObject.totalAgreeCheck = true;

        const data = {
            userid: $("#idBox").val()
            , userpw: $("#pwbox").val()
            , username: $("#namebox").val()
            , userphone: $("#phonebox").val()
            , useremail: $("#emailbox").val()
        };

        localStorage.setItem(i, JSON.stringify(data));

        i++;

        Swal.fire({
            icon: "success"
            , title: '<span class="popup-all popup-success">회원가입이 완료되었습니다.'
            ,confirmButtonColor: '#D94925'
            , closeOnClickOutside: false
        }).then(function () {
            $(".kwon_findId").css("display", "none"); // 아이디찾기
            $(".kwon_login").css("display", "block"); // 로그인창
            $(".kwon_findPw").css("display", "none"); // 비밀번호찾기
            $(".kwon_newUser").css("display", "none"); // 회원가입
            $(".main").css("background-color", "white");
            $(".mainText3").css("display", "block");
            $(".mainText4").css("display", "none");
            // 회원가입 창 값 초기화
            $("#idBox").val("");
            $("#idErr").text("");
            $("#pwbox").val("");
            $("#pwErr").text("");
            $("#checkpwbox").val("");
            $("#checkpwErr").text("");
            $("#namebox").val("");
            $("#phonebox").val("");
            $("#emailbox").val("");
            $("#pwcheck1, #pwcheck2, #pwcheck3").css("opacity", "0.1");
            $("#agreecheck1, #agreecheck2, #agreecheck3, #totalAgree").prop("checked", false);
            totalObject = {};
            location.href = "../권충오/login.html"
        })

    }
});
/*****************************************/

// 아이디찾기 

$("#idbtn").click(function () {
    var findIdid = $("#namebox_id").val();
    var findIdphone = $("#phonebox_id").val();
    var findIdemail = $("#emailbox_id").val();

    var userIdFound = false;
    var storedId;

    for (let i = 0; i < localStorage.length; i++) {

        var storedData = localStorage.getItem(i);
        var jsonData = JSON.parse(storedData);

        if (jsonData !== null) {
            var storedName = jsonData.username;
            var storedPhone = jsonData.userphone;
            var storedEmail = jsonData.useremail;
        }


        if (findIdid === storedName && findIdphone === storedPhone && findIdemail === storedEmail) {
            userIdFound = true;
            storedId = jsonData.userid;
            break;
        }
    }

    if (userIdFound) {
        Swal.fire({
            icon: "success"
            , title: `<span class="popup-all popup-success">찾으시는 아이디는 ${storedId} 입니다.`
            , confirmButtonColor: '#D94925'
            , closeOnClickOutside: false
        }).then(function () {
            $(".kwon_findId").css("display", "none"); // 아이디찾기
            $(".kwon_login").css("display", "block"); // 로그인창
            $(".kwon_findPw").css("display", "none"); // 비밀번호찾기
            $(".kwon_newUser").css("display", "none"); // 회원가입
            $(".main").css("background-color", "white");
            $(".mainText3").css("display", "block");
            $(".mainText1").css("display", "none");
        });
    } else {
        Swal.fire({
            icon: "error"
            , title: '<span class="popup-all popup-error">찾으시는 아이디가 없습니다.'
            , confirmButtonColor: '#2F4858'
            , closeOnClickOutside: false
        });
    }
});

/*****************************************/

// 비밀번호 찾기

$("#pwbtn").click(function () {
    var findPwid = $("#idBox_pw").val();
    var findPwemail = $("#emailbox_pw").val();

    var userPwFound = false;
    var storedPw;

    for (let i = 0; i < localStorage.length; i++) {

        var storedData = localStorage.getItem(i);
        var jsonData = JSON.parse(storedData);

        if (jsonData !== null) {
            var storedId1 = jsonData.userid;
            var storedEmail1 = jsonData.useremail;
        }

        if (findPwid === storedId1 && findPwemail === storedEmail1) {
            userPwFound = true;
            storedPw = jsonData.userpw;
            break;
        }
    }

    if (userPwFound) {
        Swal.fire({
            icon: "success"
            , title: `<span class="popup-all popup-success">찾으시는 아이디의 비밀번호는 ${storedPw} 입니다.`
            , confirmButtonColor: '#D94925'
            , closeOnClickOutside: false
        }).then(function () {
            $(".kwon_findId").css("display", "none"); // 아이디찾기
            $(".kwon_login").css("display", "block"); // 로그인창
            $(".kwon_findPw").css("display", "none"); // 비밀번호찾기
            $(".kwon_newUser").css("display", "none"); // 회원가입
            $(".main").css("background-color", "white");
            $(".mainText3").css("display", "block");
            $(".mainText2").css("display", "none");
        });
    } else {
        Swal.fire({
            icon: "error"
            , title: '<span class="popup-all popup-error">찾으시는 아이디가 없습니다.'
            , confirmButtonColor: '#2F4858'
            , closeOnClickOutside: false
        });
    }

});

/*****************************************/

// 로그인하기

$("#loginbtn").click(function () {
    var loginId = $("#idBox_login").val();
    var loginPw = $("#pwbox_login").val();

    var userLogin = false;
    var loginName;

    for (let i = 0; i < localStorage.length; i++) {

        var storedData = localStorage.getItem(i);
        var jsonData = JSON.parse(storedData);

        if (jsonData !== null) {
            var storedLoginId = jsonData.userid;
            var storedLoginPw = jsonData.userpw;
        }
        

        if (loginId === storedLoginId && loginPw === storedLoginPw) {
            userLogin = true;
            // 아이디
            loginid = jsonData.userid;
            // 이름
            loginName = jsonData.username;
            //이메일
            loginemail = jsonData.useremail;
            // 핸드폰번호
            loginphone = jsonData.userphone;
            break;
        }
    }

    if (userLogin) {
        Swal.fire({
            icon: "success"
            , title: `<span class="popup-all popup-success">환영합니다 ${loginName} 님`
            , confirmButtonColor: '#D94925'
            , closeOnClickOutside: false
        }).then(function () {
            loginmember["phone"] = loginphone;
            loginmember["name"] = loginName;
            loginmember["email"] = loginemail;

            localStorage.setItem("loginmember", JSON.stringify(loginmember));

            if (document.referrer === "http://127.0.0.1:5500/%EC%9D%B4%EC%84%9C%ED%9D%AC/%EC%83%81%ED%92%88%EC%83%81%EC%84%B8.html") {
                location.href = "../이서희/구매.html", "_self"
            } else if (document.referrer === "http://127.0.0.1:5500/%EA%B9%80%EC%98%81%EC%9E%AC/AS1.html") {
                location.href = "../김영재/AS2.html", "_self"
            }else if (document.referrer === "http://127.0.0.1:5500/%EC%9D%B4%EC%84%9C%ED%9D%AC/%EC%9E%A5%EB%B0%94%EA%B5%AC%EB%8B%88.html") {
                location.href = "../이서희/구매.html", "_self"
            }else {
                location.href = "../main.html";
            }

        });
    } else {
        Swal.fire({
            icon: "error"
            , title: '<span class="popup-all popup-error">아이디 또는 비밀번호를 확인해주세요.'
            , confirmButtonColor: '#2F4858'
            , closeOnClickOutside: false
        });
    }

});

