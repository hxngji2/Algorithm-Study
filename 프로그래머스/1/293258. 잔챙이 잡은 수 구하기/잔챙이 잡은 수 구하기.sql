-- 코드를 작성해주세요
SELECT COUNT(ID) AS FISH_COUNT
FROM FISH_INFO
WHERE LENGTH <= 10 IS NULL;