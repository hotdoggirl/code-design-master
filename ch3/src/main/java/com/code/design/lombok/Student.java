package com.code.design.lombok;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false, updatable = false, unique = true)
    private String email;

    @Column(name = "name", nullable = false)
    private String name;

    @CreationTimestamp
    @Column(name = "create_at", nullable = false, updatable = false)
    private LocalDateTime createAt;

    @UpdateTimestamp
    @Column(name = "update_at", nullable = false)
    private LocalDateTime updateAt;

    public Student() {
    }

    @Builder
    public Student(final String email, final String name) {
        this.email = email;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", email='" + email + '\'' +
            ", name='" + name + '\'' +
            ", createAt=" + createAt +
            ", updateAt=" + updateAt +
            '}';
    }

    public static class StudentBuilder {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "email", nullable = false, updatable = false, unique = true)
        private String email;

        @Column(name = "name", nullable = false)
        private String name;

        @CreationTimestamp
        @Column(name = "create_at", nullable = false, updatable = false)
        private LocalDateTime createAt;

        @UpdateTimestamp
        @Column(name = "update_at", nullable = false)
        private LocalDateTime updateAt;

        public static Student.StudentBuilder builder() { return  new Student.StudentBuilder();}
        public static class StudentBuilder() {
            private Long id;
            private String email;
            private String name;
            private LocalDateTime createAt;
            private LocalDateTime updateAt;

            StudentBuilder(){

            }

            public Student.StudentBuilder id(final Long id) {
                this.id = id;
                return this;
            }

            public Student.StudentBuilder email(final String email) {
                this.email = email;
                return this;
            }

            public Student.StudentBuilder name(final String name) {
                this.name = name;
                return this;
            }

            public Student.StudentBuilder createAt(final LocalDateTime createAt) {
                this.createAt = createAt;
                return this;
            }

            public Student.StudentBuilder updateAt(final LocalDateTime updateAt) {
                this.updateAt = updateAt;
                return this;
            }

            public Student build() { return this.id, this.email, this.name, this.createAt, this.updateAt}

            public String toString(){
                return "Student.StudentBuilder(id=" + this.id + ", email=" + this.email + ", name=" + this.name + ", createAt=" + this.createAt + ", updateAt=" + this.updateAt);
            }
        }
    }
}
