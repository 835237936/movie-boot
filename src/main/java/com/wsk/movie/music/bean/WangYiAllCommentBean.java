package com.wsk.movie.music.bean;

import lombok.Data;

import java.util.ArrayList;

/**
 * @DESCRIPTION : 网易评论汇总
 * @AUTHOR : WuShukai1103
 * @TIME : 2018/1/21  14:09
 */
@Data
public class WangYiAllCommentBean{
    private ArrayList<WangYiCommentsBean> hotComments;
    private ArrayList<WangYiCommentsBean> comments;
}
