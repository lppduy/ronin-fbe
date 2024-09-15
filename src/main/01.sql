-- Tạo bảng học sinh (student)
CREATE TABLE student (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(100),
                         age INT,
                         class VARCHAR(50),
                         math DECIMAL(4,2),
                         literature DECIMAL(4,2),
                         english DECIMAL(4,2),
                         total_score DECIMAL(5,2),
                         average_score DECIMAL(4,2),
                         grade VARCHAR(10)
);

-- Thêm 100 học sinh vào bảng
INSERT INTO student (name, age, class, math, literature, english, total_score, average_score, grade)
VALUES
    ('Nguyen Van A', 16, '10A1', 9.5, 8.0, 7.5, 25.0, 8.33, '10'),
    ('Le Thi B', 17, '11B2', 6.5, 7.0, 6.0, 19.5, 6.50, '11'),
    ('Tran Van C', 16, '10A1', 8.0, 7.5, 9.0, 24.5, 8.17, '10'),
    ('Hoang Thi D', 17, '11B2', 9.0, 8.5, 8.0, 25.5, 8.50, '11'),
-- Thêm tiếp các học sinh khác cho đến khi có 100 học sinh
    ('Le Thi E', 18, '12A3', 6.0, 7.0, 7.5, 20.5, 6.83, '12');

-- 1. Tìm danh sách các lớp học hiện có trong bảng
SELECT DISTINCT class FROM student;

-- 2. Đếm số học sinh trong bảng
SELECT COUNT(*) AS total_students FROM student;

-- 3. Tính tổng điểm các môn (Toán, Văn, Anh) của tất cả học sinh
SELECT
    SUM(math) AS total_math,
    SUM(literature) AS total_literature,
    SUM(english) AS total_english
FROM student;

-- 4. Tính điểm trung bình các môn (Toán, Văn, Anh) của tất cả học sinh
SELECT
    AVG(math) AS avg_math,
    AVG(literature) AS avg_literature,
    AVG(english) AS avg_english
FROM student;

-- 5. Tìm điểm cao nhất của từng môn theo từng lớp
SELECT
    class,
    MAX(math) AS max_math,
    MAX(literature) AS max_literature,
    MAX(english) AS max_english
FROM student
GROUP BY class;

-- 6. Tìm điểm thấp nhất của từng môn theo từng lớp
SELECT
    class,
    MIN(math) AS min_math,
    MIN(literature) AS min_literature,
    MIN(english) AS min_english
FROM student
GROUP BY class;

-- 7. Tìm học sinh có tên bắt đầu với chữ cái 'A'
SELECT * FROM student WHERE name LIKE 'A%';

-- 8. Tìm học sinh có điểm môn Toán là 9 hoặc 10
SELECT * FROM student WHERE math IN (9, 10);

-- 9. Lấy thông tin học sinh và sắp xếp theo điểm tổng kết từ cao đến thấp theo từng khối
SELECT * FROM student ORDER BY grade, total_score DESC;

-- 10. Lấy thông tin 5 học sinh đầu tiên trong bảng có điểm tổng kết tổng cao nhất theo thứ tự cao đến thấp
SELECT * FROM student ORDER BY total_score DESC LIMIT 5;

-- 11. Tìm học sinh có điểm môn Văn >= 8 và điểm môn Anh < 6
SELECT * FROM student WHERE literature >= 8 AND english < 6;

-- 12. Tìm học sinh có điểm môn Toán < 5 hoặc điểm tổng kết tổng < 10
SELECT * FROM student WHERE math < 5 OR total_score < 10;

-- 13. Cập nhật lớp mới cho các học sinh đủ điều kiện lên lớp
-- Điều kiện: điểm tổng kết >= 5 và không có điểm các môn nào = 0
UPDATE student
SET grade = grade + 1
WHERE total_score >= 5 AND (math > 0 AND literature > 0 AND english > 0);
