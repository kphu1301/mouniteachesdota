<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Save Lesson</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css" />
</head>
<body>
	<div class="ui container">
		<div class="ui segment">
			<h1 class="ui header center aligned">Mouni Teaches Dota</h1>
		</div>
		<div class="ui segment">
			<h3 class="ui header center aligned">Save Lesson</h3>
		
			<form:form action="saveLesson" modelAttribute="lesson" method="POST">
			
			<form:hidden path="id" />				
				<table class="ui celled table">
					<tbody>
						<tr>
							<td><label for="type">Type:</label></td>
							<td><form:input path="type" id="type" /></td>
						</tr>
						<tr>
							<td><label for="desc">Description:</label></td>
							<td><form:input path="description" id="desc" /></td>
						</tr>
						<tr>
							<td><label for="videoUrl">Video:</label></td>
							<td><form:input path="videoUrl" id="videoUrl"/></td>
						</tr>
						<tr>
							<td><label for="price">Price:</label></td>
							<td><form:input path="price" id="price" /></td>
						</tr>
						<tr>
							<td><label></label></td>
							<td>
								<input 
									class="ui primary button" 
									type="submit" value="Save" />
							</td>
						</tr>
					</tbody>
				</table>
			</form:form>
			<div style="clear; both;">
				<p>
					<a href="${pageContext.request.contextPath}/lessons" >
						Back to Lessons
					</a>
				</p>
			</div>
		</div>
	</div>
</body>
</html>