function clip(){
        
    var url = '';
    var textarea = document.createElement("textarea");
    document.body.appendChild(textarea);
    url = window.document.location.href;
    textarea.value = url;
    textarea.select();
    document.execCommand("copy");
    document.body.removeChild(textarea);
    Swal.fire({
        icon: "success"
        , title: '<span class="popup-all popup-success">URL이 복사되었습니다.'
        ,confirmButtonColor: '#D94925'
        , closeOnClickOutside: false
    });
}