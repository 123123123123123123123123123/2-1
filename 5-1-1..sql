SELECT
logins.email,
logins.password,
students.name,
students.phone,
majors.name,
majors.credits
from logins
JOIN students on logins.id = students.login_id
JOIN majors on students.id = majors.student_id
