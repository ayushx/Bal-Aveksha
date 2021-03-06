# -*- coding: utf-8 -*-
# Generated by Django 1.10.6 on 2017-04-02 07:19
from __future__ import unicode_literals

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
        ('Counsellee', '0001_initial'),
        ('Counsellor', '0001_initial'),
    ]

    operations = [
        migrations.CreateModel(
            name='SessionDetails',
            fields=[
                ('sessionID', models.AutoField(primary_key=True, serialize=False)),
                ('isCompleted', models.BooleanField(default=False)),
                ('sessionDate', models.DateField()),
                ('problem', models.CharField(max_length=100)),
                ('description', models.TextField()),
                ('reports', models.FileField(upload_to='/home/stuti/Desktop/Bal-Aveksha')),
                ('counselleefiles', models.FileField(null=True, upload_to='/home/stuti/Desktop/Bal-Aveksha')),
                ('counselleeID', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='Counsellee.CounselleeDetails')),
                ('counsellorID', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='Counsellor.CounsellorDetails')),
            ],
        ),
    ]
