-- Câu 1 : Lấy thông tin các bộ phim gồm: tiêu đề, mô tả, tên đạo diễn, tên biên kịch (bảng writers - trả về dạng array), độ dài, rating, của các bộ phim thuộc loại ‘Movie’.
SELECT m.title ,m.description ,d.full_name As director ,JSON_ARRAYAGG(w.full_name) ,m.`length` ,m.rating 
FROM movie m 
Left join director d on d.id = m.id_director 
Left join movie_writers mw on mw.id_movie = m.id 
LEFT join writers w  on w.id = mw.id_writer
Left join title_type tt on tt.id =m.id_title_type 
WHERE tt.name = 'Movie'
GROUP BY (m.id)
-- Câu 2 : Liệt kê các hãng phim (Bảng manufacturer) và số lượng phim thuộc hãng đó
SELECT m2.id, Count(*)
from manufacturer m2  
Left join movie_manufacturer mm on mm.id_manufacturer = m2.id 
LEFT Join movie m3 on m3.id = mm.id_movie 
group by(m2.id)  
-- Câu 3 : Liệt kê các phim thuộc loại TV Series đã hoàn thành (current_episode = episode)
SELECT *
FROM movie m4 
Left join title_type tt2 on tt2.id = m4.id_title_type 
WHERE m4.current_episode = 1
-- Câu 4 : Liệt kê tiêu đê, mô tả, poster, độ dài và điểm imdb của các phim thuộc loại Movie và sắp xếp theo điểm imdb giảm dần
SELECT m5.title ,m5.description ,m5.poster ,m5.`length` ,m5.imdb 
FROM movie m5 
LEFT JOIN title_type tt3 on tt3.id = m5.id_title_type 
WHERE tt3.name = 'Movie'
ORDER BY imdb DESC 
-- Câu 5 : Liệt kê tiêu đề, mô tả, poster, độ dài, thể loại (bảng genres - trả về dữ liệu dạng array), 
-- số tập và số tập đã công chiếu, của các phim thuộc loại TV mini Series, sắp xếp theo ngày công chiếu mới nhất
SELECT m6.title ,m6.description ,m6.poster ,m6.`length` ,JSON_ARRAYAGG(g.name),m6.episode ,m6.current_episode ,m6.release_date 
FROM movie m6  
LEFT JOIN movie_genres mg on mg.id_movie = m6.id 
LEFT JOIN genres g on g.id = mg.id_genres 
LEFT JOIN title_type tt4 on tt4.id = m6.id_title_type 
WHERE tt4.name = 'TV Mini Series'
GROUP BY (m6.id)
order by release_date  DESC
-- Câu 6 : Liệt kê tiêu đề, mô tả, đạo diễn, biên kịch (array), poster, độ dài, thể loại (bảng genres - trả về dữ liệu dạng array), 
-- tên diễn viên (array) của các phim thuộc loại Movie của 10 bộ phim có điểm imdb cao nhất
SELECT m7.title , m7.description , m7.id_director AS Director , JSON_ARRAYAGG(w2.full_name) AS Writer, m7.poster ,JSON_ARRAYAGG(g2.name),
JSON_ARRAYAGG(a.full_name),m7.imdb 
FROM movie m7 
LEFT JOIN director d2 on d2.id = m7.id_director 
LEFT Join movie_writers mw2 on mw2.id_movie = m7.id 
LEFT JOin writers w2 on w2.id = mw2.id_writer 
LEFT JOIN movie_genres mg2 on mg2.id_movie = m7.id 
LEFT JOIN genres g2 on g2.id = mg2.id_genres 
LEFT JOIN movie_actor ma on ma.id_movie = m7.id
LEFT JOIN actor a on a.id = ma.id_actor
LEFT JOIN title_type tt5 on tt5.id = m7.id_title_type 
WHERE tt5.name = 'Movie'
group by (m7.id)
ORDER BY m7.imdb DESC limit 10


