package com.Api.Operation.text;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@Builder
public class Text {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String blog;
    public Text(long id,String firstName, String lastName,String email,String blog){
        super();
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.blog=blog;
    }
    public Text(){
        super();
    }


}
