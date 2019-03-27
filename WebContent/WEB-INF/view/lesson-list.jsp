<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>

<html>
<head>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css" />
	<title>Dota Lessons</title>
</head>

<body>
	<div class="ui container">
		<div class="ui segment">
			<h1 class="ui header center aligned">Mouni Teaches Dota</h1>
		</div>
		<div class="ui segment">
			<button 
				class="ui button" 
				onclick="window.location.href='showAddForm'; return false;">
				Add Lesson
			</button>
			<table class="ui celled striped table">
				<thead>
					<tr>
						<th>Type</th>
						<th>Description</th>
						<th>Video</th>
						<th>Price</th>
						<th>Action</th>
				</thead>
				<tbody>
					<c:forEach var="tempLesson" items="${lessons}">
						
						<c:url var="updateLink" value="/showUpdateForm">
							<c:param name="lessonId" value="${tempLesson.id}" />
						</c:url>
						
						<c:url var="deleteLink" value="/deleteLesson">
							<c:param name="lessonId" value="${tempLesson.id}" />
						</c:url>
						
						<tr>
							<td>${tempLesson.type}</td>
							<td>${tempLesson.description}</td>
							<td>${tempLesson.videoUrl}</td>
							<td><fmt:formatNumber type="number" minFractionDigits="2" maxFractionDigits="2" value="${tempLesson.price}" /></td>
							<td>
								<a href="${updateLink}">Update</a>
								|
								<a href="${deleteLink}" 
									onclick="if (!(confirm('Confirm Delete?'))) return false">
									Delete
								</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>

</html>