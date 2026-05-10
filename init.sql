/* init.sql */
IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = N'lockdb')
BEGIN
    CREATE DATABASE [lockdb];
END
GO

USE [lockdb];
GO

-- Create the schema if it doesn't exist
IF NOT EXISTS (SELECT * FROM sys.schemas WHERE name = 'DbLock')
BEGIN
    EXEC('CREATE SCHEMA DbLock');
END
GO

-- Create the table inside the new schema
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[DbLock].[Person]') AND type in (N'U'))
BEGIN
    CREATE TABLE DbLock.Person (
        personId INT,
        version INT,
        firstName VARCHAR(255),
        lastName VARCHAR(255),
        id UNIQUEIDENTIFIER NOT NULL,
        PRIMARY KEY (id)
    );
END
GO
