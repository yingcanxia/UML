package cn.shadow.uml.builder.chain;

public class CourseBuilder {
	
	private Course course=new Course();
	public CourseBuilder addName(String name) {
		course.setName(name);
		return this;
	}
	public CourseBuilder addPPT(String ppt) {
		course.setPpt(ppt);
		return this;
	}
	public CourseBuilder addVideo(String video) {
		course.setVideo(video);
		return this;
	}
	public CourseBuilder addNote(String note) {
		course.setNote(note);
		return this;
	}
	public CourseBuilder addHomeWork(String homework) {
		course.setHomework(homework);
		return this;
	}
	
	public Course build() {
		return course;
		
	}
}
