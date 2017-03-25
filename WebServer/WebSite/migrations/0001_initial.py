# -*- coding: utf-8 -*-
# Generated by Django 1.10 on 2017-03-25 20:43
from __future__ import unicode_literals

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='AllUsers',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('first_name', models.CharField(max_length=200)),
                ('last_name', models.CharField(max_length=200)),
                ('is_counsellor', models.BooleanField(default=False)),
                ('uid', models.BigIntegerField()),
                ('username', models.CharField(max_length=100)),
            ],
        ),
        migrations.CreateModel(
            name='CounselleeSession',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('username', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='WebSite.AllUsers')),
            ],
        ),
        migrations.CreateModel(
            name='CounsellorSessions',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('username', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='WebSite.AllUsers')),
            ],
        ),
    ]
