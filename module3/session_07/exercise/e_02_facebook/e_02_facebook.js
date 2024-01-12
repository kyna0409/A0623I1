var isHidden= false;
function seeMore() {
    if (isHidden) {
        // Nếu đã ẩn, thì hiển thị lại "hide_less" và đặt giá trị của nút "see more" thành "Hide More"
        hide_less.style.display = "block";
        but_see_more.value = "Hide More";
        isHidden = false;  // Cập nhật trạng thái
    } else {
        // Nếu đang hiển thị, thì ẩn "hide_less" và đặt giá trị của nút "see more" thành "See More"
        hide_less.style.display = "none";
        but_see_more.value = "See More";
        isHidden = true;  // Cập nhật trạng thái
    }
}
function divUnderOver()
{
    a_chinh_sua.style.display="block";
}
function divUnderOut()
{
    a_chinh_sua.style.display="none";
}