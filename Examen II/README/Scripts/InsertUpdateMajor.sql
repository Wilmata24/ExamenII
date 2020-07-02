USE [LAC-EPII]
GO

/****** Object:  StoredProcedure [dbo].[InsertUpdateMajor]    Script Date: 2/7/2020 16:05:07 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



CREATE PROCEDURE [dbo].[InsertUpdateMajor] (
									   @MajorId INTEGER,
                                       @Name    VARCHAR(50), 
                                       @Semesters INTEGER,
                                       @Action  VARCHAR(10)) 
AS 
  BEGIN 
      IF @Action = 'Insert' 
        BEGIN 
            INSERT INTO Major 
                        (Name, 
                         Semesters) 
            VALUES     (@Name, 
                        @Semesters); 
        END 
      IF @Action = 'Update' 
        BEGIN 
            UPDATE Major 
            SET    Name = @Name, 
                   Semesters = @Semesters 
            WHERE  Major_Id = @MajorId; 
        END 
  END 
GO

