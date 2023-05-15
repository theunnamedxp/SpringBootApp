package Project.Final.springbootmongodb2.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="todos")

public class TodoDTO {
 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TodoDTO(String id, String todo, String description, Boolean completed, Date createdAt, Date updateAt) {
		
		this.id = id;
		this.todo = todo;
		this.description = description;
		this.completed = completed;
		this.createdAt = createdAt;
		this.updatedAt = updateAt;
	}

	public TodoDTO() {
	}

	public String getTodo() {
		return todo;
	}

	public String getDescription() {
		return description;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public void setUpdatedAt(Date updateAt) {
		this.updatedAt = updateAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Id
	private String id;
	
    @NotNull(message = "todo cannot be null")
	private String todo;
	
    @NotNull(message = "description cannot be null")
	private String description;
	
    @NotNull(message = "completed cannot be null")
	private Boolean completed;
	
	private Date createdAt;
	
	private Date updatedAt;

}
