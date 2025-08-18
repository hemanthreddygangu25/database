# Write your MySQL query statement below
SELECT ST.student_id,
    ST.student_name,
    SU.subject_name, 
    IFNULL((SELECT COUNT(Ex.student_id)
    FROM Examinations Ex
    WHERE SU.subject_name = Ex.subject_name
    AND ST.student_id = Ex.student_id
    GROUP BY Ex.subject_name),0)
    AS attended_exams 
FROM Students ST
CROSS JOIN Subjects SU
ORDER BY student_id, subject_name;