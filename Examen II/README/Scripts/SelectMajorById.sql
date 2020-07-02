USE [LAC-EPII]
GO

/****** Object:  StoredProcedure [dbo].[SelectMajorById]    Script Date: 2/7/2020 16:04:48 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



create PROCEDURE [dbo].[SelectMajorById] (@MajorId  INTEGER) 

AS 
  BEGIN 
       SELECT *
      FROM  Major 
	  WHERE Major_Id=@MajorId; 
END 
GO

