package com.demoinstaapp.model;

    public class ChattingListModel {


        private String title;
        private String Chat;
        private int imageUrl;

        public ChattingListModel(String title,String Chat, int imageUrl){

            this.title = title;
            this.imageUrl = imageUrl;
            this.Chat = Chat;
        }

        public String getChat() {
            return Chat;
        }

        public void setChat(String chat) {
            Chat = chat;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(int imageUrl) {
            this.imageUrl = imageUrl;
        }


        // getters & setters
    }

