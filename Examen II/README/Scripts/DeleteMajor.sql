USE [LAC-EPII]
GO

/****** Object:  StoredProcedure [dbo].[DeleteMajor]    Script Date: 2/7/2020 16:05:19 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



create PROCEDURE [dbo].[DeleteMajor] (@MajorId INTEGER) 
AS 
  BEGIN 
      DELETE Major 
      WHERE  Major_Id = @MajorId; 
  END

GO

