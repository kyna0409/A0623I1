-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select SubName, max(Credit)as cr from subject
group by  SubName;

select SubName, max(Credit)as cr from subject
group by  SubName
having max(credit) >= all(select max(credit) from subject group by subname);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất. 

select SubName, max(mark) as marks from subject
join mark on mark.SubId = subject.SubId
group by  SubName;

select StudentId,studentname, max(mark) as marks from subject
join mark on mark.SubId = subject.SubId
group by  SubName
having  marks >= all(select max(mark) from mark group by mark);
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select studentname, avg(mark) as TB from student
join mark on mark.StudentId= student.StudentId
group by studentname
order by TB desc;
select s.studentname, s.phone, s.address, avg(mark) from student s
join mark m on m.studentid= s.studentid
group by s.studentid
ORDER BY avg(mark) DESC;