package io.github.yonghochoi.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class Comment implements Serializable{
    private Long commentNo;
    private String userId;
    private Date regDate;
    private String commentContent;
}
