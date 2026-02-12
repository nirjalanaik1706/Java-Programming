package com.tap.tfl.assessment.Entity;

public class QuestionEntity {

    private int id;
    private String title;

    public QuestionEntity() {
        this.id = 0;
        this.title = "Java";
    }

    public QuestionEntity(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

     @Override
    public String toString(){
        return "QuestionEntity{id="+id+",title='"+title+"'}";
    }

    // @Override
    // public boolean equals(Object obj){
    //     if (this == obj) return true;
    //     if (obj == null || getClass() != obj.getClass()) return false;
    //     QuestionEntity other = (QuestionEntity) obj;
    //     return id==other.id &&
    //             Objects.equals(title, other.title);
    // }

    // @Override
    // public int hashCode(){
    //     return Objects.hash(id,title);
    // }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}


