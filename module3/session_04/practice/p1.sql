-- Hiển thị số lượng sinh viên ở từng nơi Tính điểm trung bình các môn học của mỗi học viên 
select s.studentname ,avg(m.mark)as tb from student s
join mark m on m.StudentId= s.StudentId
group by s.StudentId, s.StudentName;
-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15 
select s.studentname ,avg(m.mark)as tb from student s
join mark m on m.StudentId= s.StudentId
group by s.StudentId, s.StudentName
having tb>=15;
-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.mark
SELECT S.StudentId, S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
HAVING AVG(Mark) >= ALL (SELECT AVG(Mark) FROM Mark GROUP BY Mark.StudentId);