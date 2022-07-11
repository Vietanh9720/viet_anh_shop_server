package com.va.common;

public class HttpStatusConstants {
    public static Integer SUCCESS_CODE = 200;
    public static String SUCCESS_MESSAGE = "Successful";
    public static Integer GET_ALL_PRODUCT_FAILURE_CODE = 300;
    public static String GET_ALL_PRODUCT_FAILURE_MESSAGE= "Không tìm thấy sản phẩm";
    public static Integer INVALID_FIELD_CODE = 301;
    public static String INVALID_FIELD_MESSAGE= "Trường không hợp lệ";
    public static Integer UPDATE_PRODUCT_FAILURE_CODE = 302;
    public static String UPDATE_PRODUCT_FAILURE_MESSAGE= "Không thể cập nhật sản phẩm ngay bây giờ, thủ lại sau";
    public static Integer CREATE_PRODUCT_FAILURE_CODE = 303;
    public static String CREATE_PRODUCT_FAILURE_MESSAGE= "Không thể tạo mới sản phẩm ngay bây giờ, thủ lại sau";
    public static Integer DELETE_PRODUCT_FAILURE_CODE = 304;
    public static String DELETE_PRODUCT_FAILURE_MESSAGE= "Không thể xóa sản phẩm ngay bây giờ, thủ lại sau";
    public static Integer PRODUCT_EXISTS_CODE = 305;
    public static String PRODUCT_EXISTS_MESSAGE= "Sản phẩm này đã tồn tại";
}
