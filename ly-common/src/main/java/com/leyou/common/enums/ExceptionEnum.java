package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
    PRICE_CANNOT_BE_NULL(400,"价格不能为空"),
    CATEGORY_NOT_FOUND(404,"商铺未查到"),
    BRAND_NOT_FOUND(404,"品牌未找到"),
    BRANDSAVE_ERROR(500,"新增品牌失败")
    ;
    private  int code;
    private  String msg;
}
