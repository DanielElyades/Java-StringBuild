package entities;

<<<<<<< HEAD
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date momment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
		
	}

	public Post(Date momment, String title, String content, Integer likes) {
		//super();
		this.momment = momment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public void setMomment(Date momment) {
		this.momment = momment;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Date getMomment() {
		return momment;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Integer getLikes() {
		return likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
public void removeCommet (Comment comment) {
		comments.add(comment);	
		}
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(title + "\n");
	sb.append(likes);
	sb.append(" Likes - ");
	sb.append(sdf.format(momment) + "\n");
	sb.append(content + "\n");
	sb.append("commets: \n");
	
	for (Comment c : comments) {
		sb.append(c.getText()+"\n");
	}
	return sb.toString();
	
}
=======
public class Post {

>>>>>>> 94a1b9492b1e247fa00fd6d0988b8daae4179811
}
