DROP TABLE job_grades;

CREATE TABLE job_grades (
grade_level	VARCHAR(2) CONSTRAINT jobgrades_grade_pk PRIMARY KEY,
lowest_sal	NUMBER(8,2) NOT NULL,		
highest_sal	NUMBER(8,2) NOT NULL );

INSERT INTO job_grades VALUES ('A', 1000, 2999);

INSERT INTO job_grades VALUES ('B', 3000, 5999);

INSERT INTO job_grades VALUES ('C', 6000, 9999);

INSERT INTO job_grades VALUES ('D', 10000, 14999);

INSERT INTO job_grades VALUES ('E', 15000, 24999);

INSERT INTO job_grades VALUES ('F', 25000, 40000);

COMMIT;

