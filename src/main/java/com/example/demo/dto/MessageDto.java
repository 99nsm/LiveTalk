package com.example.demo.dto;

import java.time.LocalDateTime;

public class MessageDto {

    // 메시지 고유 번호 (PK)
    private Long msgSeqNo;

    // 메시지 타입 (text, img, video 등)
    private String msgType;

    // 메시지 내용
    private String msgContent;

    // 메시지 작성자 회원 번호
    private Long senderUserSeqNo;

    // 메시지가 속한 채팅방 번호
    private Long chatRoomSeqNo;

    // 메시지 작성 시간
    private LocalDateTime msgCreateDt;
}

