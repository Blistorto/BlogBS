package br.com.blog.model.business;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bloggers")
public class Blogger extends Person {

}
