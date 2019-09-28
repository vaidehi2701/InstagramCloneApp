package com.demoinstaapp.model;

    public class LikeModel{

        private String Name;
        private int imgId;

        public LikeModel(String Name, int imgId) {
            this.Name = Name;
            this.imgId = imgId;
        }
        public String getName() {
            return Name;
        }
        public void setName(String Name) {
            this.Name = Name;
        }
        public int getImgId() {
            return imgId;
        }
        public void setImgId(int imgId) {
            this.imgId = imgId;
        }
    }
