package com.example.demo.dto;

import java.time.LocalDateTime;

public class MessageReadDto {

    // 메시지를 읽은 사용자 번호
    private Long readerUserSeqNo;

    // 메시지 번호
    private Long msgSeqNo;

    // 읽음 여부 (Y/N)
    private String isRead;

    // 메시지 읽은 시간
    private LocalDateTime readDt;
}
