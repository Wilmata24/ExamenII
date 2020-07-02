USE [LAC-EPII]
GO

/****** Object:  StoredProcedure [dbo].[SelectMajor]    Script Date: 2/7/2020 16:04:22 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[SelectMajor] 
AS 
  BEGIN 
      SELECT *
      FROM  Major M
END 
GO

