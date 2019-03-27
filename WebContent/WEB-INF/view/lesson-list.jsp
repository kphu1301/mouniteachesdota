<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css" />
	<title>Dota Lessons</title>
</head>

<body>
	<div class="ui container">
		<div class="ui segment">
			<h1 class="ui header center aligned">Dota Lessons</h1>
		</div>
		<div class="ui segment">
			<table class="ui celled striped table">
				<thead>
					<tr>
						<th>Lesson</th>
						<th>Description</th>
						<th>Video</th>
						<th>Price</th>
				</thead>
				<tbody>
					<c:forEach var="tempLesson" items="${lessons}">
					<tr>
						<td data-label="Lesson">${tempLesson.title}</td>
						<td data-label="Description">${tempLesson.description}</td>
						<td data-label="Video">${tempLesson.videoUrl}</td>
						<td data-label="Price">${tempLesson.price}</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>

</html>