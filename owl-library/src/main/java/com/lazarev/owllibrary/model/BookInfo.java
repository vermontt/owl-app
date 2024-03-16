package com.lazarev.owllibrary.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookInfo {

    private String bookName;
    private String bookAuthor;
    private Integer bookPages;
    private String bookPublication;

}
