package io.github.yonghochoi.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class Reply implements Serializable{
    private Long replyNo;
    private Long commentNo;
    private String userId;
    private String replyContent;
    private Date regDate;
}
