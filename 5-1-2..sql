SELECT
logins.email,
logins.password,
students.name,
students.phone,
majors.name,
majors.credits,
teachers.name,
teachers.phone
from logins
JOIN students on logins.id = students.login_id
JOIN majors on students.id = majors.student_id
LEFT JOIN teachers on majors.id = teachers.major_id
