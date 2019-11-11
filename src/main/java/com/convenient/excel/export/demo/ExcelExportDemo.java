package com.convenient.excel.export.demo;

import com.convenient.excel.export.annotation.*;


@ExcelISheet(name = "sheet1")
public class ExcelExportDemo {


    @ExcelExportHead(title = "名字", startRow = 0, endRow = 1, startCell = 0, endCell = 3)
    private String name;

    @ExcelExportHead(title = "类型", startRow = 0, endRow = 1, startCell = 4, endCell = 7)
    private String type;

    @ExcelExportHead(title = "年龄", startRow = 0, endRow = 1, startCell = 8, endCell = 9)
    private String age;

    @ExcelExportHead(title = "地址", startRow = 0, endRow = 1, startCell = 10, endCell = 12)
    private String adrress;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }
}